pipeline {
agent any
stages {
stage('Build') {
steps {
sh'flake8 . --exit-zero --format=pylint --output-file= /flake8.log'
  }
  post{
    always{
        scanForIssues tool: flake8(pattern: 'flake8.log')
    }
}
}
}
}
