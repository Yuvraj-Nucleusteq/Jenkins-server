pipeline {
agent any
stages {
stage('Build') {
steps {
sh'flake8 . --exit-zero'
  }
}
}
}
