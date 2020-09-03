
def call() {
    stage('Maven: Build') {
        node('master') {
            powershell script: 'echo "From powershell"'
        }
        println "Build from the maven library"
        
    }
}
