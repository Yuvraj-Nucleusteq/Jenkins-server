job('DSL-job'){
    description("running job through job-dsl")
    scm{
        git("https://github.com/Yuvraj-Nucleusteq/Jenkins-server.git","main")
    }
    triggers{
        githubPush()
    }
    steps{
        shell("python Sum.py")
        shell("flake8 . --exit-zero")
    }
}