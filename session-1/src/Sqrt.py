class Solution:
    def mySqrt(self, x: int) -> int:
        if x == 0:
            return 0

        low = 1
        high = 46340

        answer = 0

        while low <= high:
            mid = (low + high) // 2

            if mid * mid == x:
                answer = mid
                break
            elif mid * mid < x:
                answer = max(answer, mid)
                low = mid + 1
            else:
                high = mid - 1

        return answer
