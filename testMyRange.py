def buildList(start,stop,step,myList):
    if start < stop:
        while start < stop:
            myList.append(start)
            start = start + step
    else:
        while start > stop:
            myList.append(start)
            start = start + step

def myRange(start, stop = None, step = None):
    lyst = []

    if stop == None and step == None:
        sValue = 0
        step = 1

        buildList(sValue,start,step,lyst)
    elif step == None:
        step =1
        buildList(start,stop, step, lyst)
    else:
        buildList(start, stop, step, lyst)

    return lyst

def main():
    print(myRange(10))
    print(myRange(1,10))
    print(myRange(1,10,2))
    print(myRange(10,0,-1))

if __name__ == "__main__":
    main()
