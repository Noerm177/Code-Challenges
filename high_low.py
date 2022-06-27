def high_low(number):
    value = [int(i) for i in number.split(" ")]
    return "%i %i" % (max(number), min(number))