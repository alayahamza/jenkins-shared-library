class Git {

    def log(String str) {
        println('********************************************************')
        println(str)
        println('********************************************************')
    }

    def buildPackage(String credentials, String branch, String url) {
        git credentialsId: credentials, branch: branch, url: url
    }

}
