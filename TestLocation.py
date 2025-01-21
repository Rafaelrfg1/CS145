import numpy as np

def locate_largest(arr):
    max_index = np.unravel_index(np.argmax(arr, axis=None), arr.shape)
    max_value = arr[max_index]
    return max_index[0], max_index[1], max_value

def main():
    rows, cols = map(int, input("Enter the number of rows and columns in the array: ").split())
    
    print("Enter the array:")
    array = np.array([list(map(float, input().split())) for _ in range(rows)])
    
    row, col, max_val = locate_largest(array)
    print(f"The location of the largest element {max_val} is at ({row}, {col})")

if __name__ == "__main__":
    main()