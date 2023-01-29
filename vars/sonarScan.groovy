def call(Map config) {
    container('mvn-jdk11') {
        stage('SonarQube analysis') {
            withSonarQubeEnv('docker-env-sonar') {
                sh '''
                    mvn -Dmaven.repo.local=/.m2/repository sonar:sonar
                '''
            }
        }
    }
}
