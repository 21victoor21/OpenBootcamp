resource local_file name{
    filename = "sample.txt"
    content = "This is HCL"
}

resource random_string name{
    length = 10
}