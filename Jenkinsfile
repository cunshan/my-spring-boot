pipeline {
  agent any
  stages {
    stage('error') {
      steps {
        git(changelog: true, url: 'https://github.com/cunshan/my-spring-boot.git', branch: 'master', credentialsId: 'aa')
      }
    }
  }
}