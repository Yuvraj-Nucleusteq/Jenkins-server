pipeline {
agent any
stages {
stage('Build') {
steps {
sh'flake8 . --exit-zero --format=pylint --output-file=/var/lib/jenkins/workspace/DSL-test/flake8.log'
  }
  post{
    always{
        recordIssues tool: flake8(pattern: 'flake8.log')
    }
}
}
}
}
