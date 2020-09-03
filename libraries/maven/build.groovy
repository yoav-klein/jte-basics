
def call() {
   
       stage('maven:Build')
   {  
      node('master') {
         powershell script: 'echo Hello'  
      }
   }
}
