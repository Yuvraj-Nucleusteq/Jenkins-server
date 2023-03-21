pipeline {
agent any
stages {
stage('Build') {
steps {
sh'flake8 . --exit-zero --format=pylint -o report.txt'
  }
  post{
    always{
        scanForIssues tool: flake8(pattern: 'report.txt')
    }
}
}
}
}
