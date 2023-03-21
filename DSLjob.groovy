pipeline {
agent any
stages {
    stage('Build') {
        steps {
            sh'flake8 . --exit-zero --format=pylint > flake8.log'
            }
  post{
    always{
        recordIssues tool: flake8(pattern: 'flake8.log')
        recordIssues failOnError: true, qualityGates: [[threshold: 10, type: 'TOTAL', unstable: false]], tools: [flake8()]
    }
}
}
}
}
