def call(Map config) {
    stage('Git checkout') {
        container('jenkins-slave') {
            log('Git checkout')
            git credentialsId: "$config.credentialsId", branch: "$config.branch", url: "$config.url"
        }
    }
    stage('mvn build') {
        container('jenkins-slave') {
            log('maven build')
            sh '''
            mvn clean install
        '''
        }
    }
}
