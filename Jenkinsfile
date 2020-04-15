pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'echo "Its a build stage"'
		sh 'sbt clean compile'
            }
        }
    }
    post {
        always {
            echo 'I am Always block'
        }
        success {
            echo 'I am success block'
        }
        failure {
            echo 'I am failure block'
        }
        unstable {
            echo 'I am unstable block'
        }
        changed {
            echo 'Something has changed'
        }
    }
}
