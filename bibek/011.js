var maxArea = arr => {
    let i = 0, j = arr.length - 1, max = 0;
    while (i < j) {
        max = Math.max(max, Math.min(arr[i], arr[j]) * Math.abs(i - j));
        if (arr[i] <= arr[j]) i++;
        else j--;
    }
    return max;
}
