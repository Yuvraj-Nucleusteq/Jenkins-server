pipeline {
agent any
stages {
stage('Build') {
steps {
sh'flake8 . --exit-zero --format=pylint'
  }
  post{
    always{
        scanForIssues tool: flake8(pattern: 'Sum.py')
    }
}
}
}
}
