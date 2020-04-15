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
}
