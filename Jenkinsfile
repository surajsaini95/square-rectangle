pipeline {
	agent any
	stages {
		stage('Build') {
			steps {
				echo "Cleaning and compiling..."
				sbt clean compile
			}
		}
	}
}
