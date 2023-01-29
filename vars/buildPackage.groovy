def call(Map config) {
    
    stage('Git checkout') {
        container('mvn-jdk8') {
            log('Git checkout')
            git credentialsId: "$config.credentialsId", branch: "$config.branch", url: "$config.url"
        }
    }
    
    stage('mvn build') {
        container('mvn-jdk8') {
            log('maven build')
            sh '''
            mvn -Dmaven.repo.local=/.m2/repository clean install
        '''
        }
    }
}
