
def call() {
   
        pipeline 
        {
            agent { label 'master' }
            stages
            {
                stage('First')
                {
                    echo "Step"   
                }
            }
        }
    
}
