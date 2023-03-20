jobDsl('DSL-job') {
  steps {
    shell('echo Hello World!')
  }
}
// dsljob('DSL-job'){
//     description("running job through job-dsl")
//     scm{
//         git("https://github.com/Yuvraj-Nucleusteq/Jenkins-server.git","main")
//     }
//     triggers{
//         githubPush()
//     }
//     steps{
//         shell("flake8 . --exit-zero")
//     }
// }