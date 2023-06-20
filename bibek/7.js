var maximumProduct = nums => {
  arr = nums.sort((a, b) => a - b);
  return Math.max(
    [...arr.slice(-1), ...arr.slice(0, 2)].reduce((a, b) => a * b, 1),
    arr.slice(-3).reduce((a, b) => a * b, 1)
  );
}
