def call() {
 println "HERE"
 println pipelineConfig.keywords.getClass()
 pipelineConfig.keywords.each {
  println "${it.key}: ${it.value}"
 }
}
