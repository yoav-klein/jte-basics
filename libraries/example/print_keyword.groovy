def call() {
 println "HERE"
 println pipelineConfig.keywords.getClass()
 pipelineConfig.keywords.each {
  println "${it.key}: ${it.value}"
 }
 
 println "With pipelineConfig.basepath: ${pipelineConfig.basepath}"
 //println "With keywords.basepath: ${keywords.basepath}"
 println "With basepath: ${basepath}"
 println "with pipelineConfig.keywords.basepath: ${pipelineConfig.keywords.basepath}"
}
