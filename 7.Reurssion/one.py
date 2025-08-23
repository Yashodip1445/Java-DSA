def printNumber(Lrange , Urange ):
    # base case 
    if Lrange >Urange :
        return 
    
    print(Lrange)
    printNumber(Lrange+1 , Urange)

printNumber(1, 5)
