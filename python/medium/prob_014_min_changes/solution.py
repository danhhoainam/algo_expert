def min_number_coins_for_change(n, denoms):
    numbers = [float("inf") for amount in range(n + 1)]
    numbers[0] = 0 # base case
    for denom in denoms:
        for amount in range(len(numbers)):
            if denom <= amount:
                # we compare the current value to the value that we use 1 coin of X
                numbers[amount] = min(numbers[amount], 1 + numbers[amount - denom]) 
    return numbers[n] if numbers[n] != float("inf") else -1

print(min_number_coins_for_change(7, [1,2,5]))