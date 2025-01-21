def get_number(ch):
    char_to_number = {
        **dict.fromkeys("ABC", 2),
        **dict.fromkeys("DEF", 3),
        **dict.fromkeys("GHI", 4),
        **dict.fromkeys("JKL", 5),
        **dict.fromkeys("MNO", 6),
        **dict.fromkeys("PQRS", 7),
        **dict.fromkeys("TUV", 8),
        **dict.fromkeys("WXYZ", 9)
    }
    ch_upper = ch.upper()
    number = char_to_number.get(ch_upper, ch)
    print(number, end="")
    return number

def main():
    user_string = input("Please input a string:\n")
    for ch in user_string:
        get_number(ch)
    print()

if __name__ == "__main__":
    main()
 
