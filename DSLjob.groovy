job('DSL-job'){
    description("running job through job-dsl")
    scm{
        git("https://github.com/Yuvraj-Nucleusteq/Jenkins-server.git","main")
    }
    triggers{
        githubPush()
    }
    steps{
        python("python Sum.py")
        flake8("flake8 . --exit-zero")
    }
}