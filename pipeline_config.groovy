allow_scm_jenkinsfile = true
artifacts_directory = "artifacts"

libraries {
  merge=true
  post
  sonar
  artifactory {
    source = pipelineConfig.artifacts_directory 
  }
  example {
    details {
    number = 2
    messages = ["First message", "Second message", "Third message"]
    }
  }
}

application_environments {
  dev {
    long_name = "Devlopmento" 
  }
  prod {
    long_name = "Productionzio"
  }
}
