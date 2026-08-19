public class test {

    /**
     * Tính tổng tất cả các số chẵn trong mảng.
     * Nếu mảng null hoặc rỗng, trả về 0.
     */
    public int sumEvenNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) { // Rẽ nhánh 1
            return 0;
        }

        int sum = 0;
        for (int num : numbers) { // Vòng lặp
            if (num % 2 == 0) { // Rẽ nhánh 2
                sum += num;
            }
        }

        return sum;
    }

    // Thêm phương thức main để Java có thể chạy được file này
    public static void main(String[] args) {
        test app = new test();

        int[] sampleData = {1, 2, 3, 4, 5, 6};
        int result = app.sumEvenNumbers(sampleData);

        System.out.println("Tong cac so chan la: " + result);
    }
}