
public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1
		int a = 6;
		if (a % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}

		// 2
		int heavy = 52;
		double price = 0;
		if (heavy <= 50) {
			price = heavy * 0.15;
			System.out.println(price + "元");
		} else {
			price = 50 * 0.15 + (heavy - 50) * 0.1;
			System.out.println(price + "元");
		}

		// 3
		int t1 = 6;
		int t2 = 1;
		int t3 = 4;
		if ((t1 + t2) > t3) {
			if ((t1 + t3) > t2) {
				if ((t2 + t3) > t1) {
					System.out.println("是三角形");
				} else {
					System.out.println("不是三角形");
				}
			} else {
				System.out.println("不是三角形");
			}
		} else {
			System.out.println("不是三角形");
		}

		// 4
		float begin = System.nanoTime();
		int a4 = 9;
		int b4 = -2;
		int c4 = 6;
		
//		for (int i = 0; i < 10000000; i++) {
//
//		}
		if (a4 > b4) {
			if (a4 < c4) {
				System.out.println("a4是中间值");
			} else if (c4 > b4) {
				System.out.println("c4是中间值");
			} else {
				System.out.println("b4是中间值");
			}
		} else {
			if (b4 < c4) {
				System.out.println("b4是中间值");
			} else if (c4 > a4) {
				System.out.println("c4是中间值");
			} else {
				System.out.println("a4是中间值");
			}
		}
		float end = System.nanoTime() - begin;
		System.out.println("耗时：" + end + "毫秒");

		// 4-2
		float begin1 = System.nanoTime();
		int x = 9;
		int y = -2;
		int z = 6;
		int mid = 0;
		int max = 0;
		int min = 0;
//		for (int i = 0; i < 10000000; i++) {
//
//		}
		max = x > y ? x : y;
		max = max > z ? max : z;
		min = x < y ? x : y;
		min = min < z ? min : z;
		
		mid = x + y + z - max - min;
		System.out.println("第二次中间值是" + mid);

		float end1 = System.nanoTime() - begin1;
		System.out.println("耗时：" + end1 + "毫秒");

		// 5
System.out.println(end1-end);
		// 6
		int birMon = 12;// 出生月
		int birDay = 31;// 出生日
		int dayCount = 0;
		if (birMon >= 1 && birMon <= 12) {
			switch (birMon) {
			case 12:

				dayCount += birDay;

			case 11:
				if (birMon > 11) {
					dayCount += 30;
				} else {
					dayCount += birDay;
				}

			case 10:
				if (birMon > 10) {
					dayCount += 31;
				} else {
					dayCount += birDay;
				}
			case 9:
				if (birMon > 9) {
					dayCount += 30;
				} else {
					dayCount += birDay;
				}
			case 8:
				if (birMon > 8) {
					dayCount += 31;
				} else {
					dayCount += birDay;
				}
			case 7:
				if (birMon > 7) {
					dayCount += 31;
				} else {
					dayCount += birDay;
				}
			case 6:
				if (birMon > 6) {
					dayCount += 30;
				} else {
					dayCount += birDay;
				}
			case 5:
				if (birMon > 5) {
					dayCount += 31;
				} else {
					dayCount += birDay;
				}
			case 4:
				if (birMon > 4) {
					dayCount += 30;
				} else {
					dayCount += birDay;
				}
			case 3:
				if (birMon > 3) {
					dayCount += 31;
				} else {
					dayCount += birDay;
				}

			case 2:
				if (birMon >= 2) {
					if (birMon > 2) {
						dayCount += 28;
					} else if (birDay > 28) {
						System.out.println("2月只有28天");
						break;
					} else {
						dayCount += birDay;
					}
				}

			case 1:
				if (birMon > 1) {
					dayCount += 31;
				} else {
					dayCount += birDay;
				}

			}
			System.out.println("活了" + dayCount + "天");
		} else {
			System.out.println("月份错误");
		}

	}

}
