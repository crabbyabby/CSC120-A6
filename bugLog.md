## Bug 1
Brief description: buy() doesn't throw an exception if the computer is already added to the inventory
Failed unit test: test_buy_exception()

## Bug 2
Brief description: buy() doesn't add the requested computer into the inventory, just a pre-determined newComputer.
Failed unit test: test_buy()

## Bug 3
Brief description: sell() doesn't throw an exception if the computer is not in the inventory
Failed unit test: test_sell_exception()

## Bug 4
Brief description: ResaleShop constructor creates shop already having a computer in its inventory, when it shouldn't have anything
Failed unit test: test_ResaleShop_Constructor()

## Bug 5
Brief description: setOS() always sets the operating system to "None" and not the actual parameter
Failed unit test: test_setOS()

## Bug 6
Brief description: Computer constructer always sets memory to 16 and ignores the memory parameter.
Failed unit test: test_Computer_memory()

## Bug 7
Brief description: Computer constructor always sets price to 0 and ignores the price parameter.
Failed unit test: test_Computer_price()

## Bug 8
Brief description: Computer printInventory uses <= instead of < in the for-loop which will lead to an IndexOutOfBounds error.
Failed unit test: test_printInventory()

## Bug 9
Brief description: Computer refurbish does not set the newOS to the parameter, due in part to setOS being bugged.
Failed unit test: test_refurbish()

## Bug 10
Brief description: Refurbish() sets price incorrectly, giving a high price (2500) when it should assign 250.
Failed unit test: test_refurbish_price()