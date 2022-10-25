from functools import reduce


def filterReduce(lista):
    flist = filter(lambda x: x % 2, lista)
    res = reduce(lambda a,b: a + b, flist)
    return res

print(filterReduce([1,2,3,4,5,6,7,8,9]))