pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'echo "Its a build stage"'
		sh 'sbt clean compile'
            }
        }
	stage('Scalastyle') {
            steps {
                sh 'echo "Its a Scalastyle stage"'
		sh 'sbt scalastyle'
            }
        }
	stage('Test & Coverage') {
            steps {
                sh 'echo "Its a Coverage stage"'
		sh 'sbt coverage test coverageReport'
            }
        }
	stage('Package') {
            steps {
                sh 'echo "Its a Package stage"'
		sh 'sbt package'
            }
        }
    }
    post {
        always {
            echo 'I am Always block'
        }
        success {
            echo 'I am success block'
	    slackSend channel: '#3musketers',
                  color: 'good',
                  message: "The pipeline ${currentBuild.fullDisplayName} completed successfully."
	}
        failure {
            echo 'I am failure block'
	    slackSend channel: '#3musketers',
                  color: 'good',
                  message: "The pipeline ${currentBuild.fullDisplayName} failed."	
        }
        unstable {
            echo 'I am unstable block'
        }
        changed {
            echo 'Something has changed'
        }
    }
}
