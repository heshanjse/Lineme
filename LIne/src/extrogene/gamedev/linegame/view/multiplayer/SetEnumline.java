package extrogene.gamedev.linegame.view.multiplayer;

import extrogene.gamedev.linegame.view.draw.Givedots;
import extrogene.gamedev.linegame.view.draw.LindrawView;
import extrogene.gamedev.linegame.view.draw.enLine;
import extrogene.gamedev.linegame.view.level.level1_1;

public class SetEnumline {
	public static int chekresult() {

		return 1;

	}

	public static void SetLine(int x, int y) {
		if (y < x) {
			int z = x;
			x = y;
			y = z;
		}

		switch (x) {
		case 1:
			switch (y) {
			case 2:
				if (challenge.enLineMap_defaultchallange.get(enLine.L1_2) != null) {				
						challenge.enLineMap_defaultchallange
								.put(enLine.L1_2, Givedots
										.setall(1, 2, challenge.enLineMap_defaultchallange
												.get(enLine.L1_2)
												.getRepnum() + 1));

				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L1_2,
							Givedots.setall(1, 2, 1));
				}
				break;

			case 3:
				if (challenge.enLineMap_defaultchallange.get(enLine.L1_3) != null) {
					
						challenge.enLineMap_defaultchallange
								.put(enLine.L1_3, Givedots
										.setall(1, 3, challenge.enLineMap_defaultchallange
												.get(enLine.L1_3)
												.getRepnum() + 1));

				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L1_3,
							Givedots.setall(1, 3, 1));
				}
				break;
			case 4:
				if (challenge.enLineMap_defaultchallange.get(enLine.L1_4) != null) {
					
						challenge.enLineMap_defaultchallange
								.put(enLine.L1_4, Givedots
										.setall(1, 4, challenge.enLineMap_defaultchallange
												.get(enLine.L1_4)
												.getRepnum() + 1));

				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L1_4,
							Givedots.setall(1, 4, 1));
				}
				break;
			case 5:
				if (challenge.enLineMap_defaultchallange.get(enLine.L1_5) != null) {
						challenge.enLineMap_defaultchallange
								.put(enLine.L1_5, Givedots
										.setall(1, 5, challenge.enLineMap_defaultchallange
												.get(enLine.L1_5)
												.getRepnum() + 1));

				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L1_5,
							Givedots.setall(1, 5, 1));
				}
				break;
			case 6:
				if (challenge.enLineMap_defaultchallange.get(enLine.L1_6) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L1_6, Givedots
										.setall(1, 6, challenge.enLineMap_defaultchallange
												.get(enLine.L1_6)
												.getRepnum() + 1));

				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L1_6,
							Givedots.setall(1, 6, 1));
				}
				break;
			case 7:
				if (challenge.enLineMap_defaultchallange.get(enLine.L1_7) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L1_7, Givedots
										.setall(1, 7, challenge.enLineMap_defaultchallange
												.get(enLine.L1_7)
												.getRepnum() + 1));

				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L1_7,
							Givedots.setall(1, 7, 1));
				}
				break;
			case 8:
				if (challenge.enLineMap_defaultchallange.get(enLine.L1_8) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L1_8, Givedots
										.setall(1, 8, challenge.enLineMap_defaultchallange
												.get(enLine.L1_8)
												.getRepnum() + 1));
				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L1_8,
							Givedots.setall(1, 8, 1));
				}
				break;
			case 9:
				if (challenge.enLineMap_defaultchallange.get(enLine.L1_9) != null) {
						challenge.enLineMap_defaultchallange
								.put(enLine.L1_9, Givedots
										.setall(1, 9, challenge.enLineMap_defaultchallange
												.get(enLine.L1_9)
												.getRepnum() + 1));

				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L1_9,
							Givedots.setall(1, 8, 1));
				}
				break;
			default:
				break;
			}
			break;
		case 2:
			switch (y) {

			case 3:
				if (challenge.enLineMap_defaultchallange.get(enLine.L2_3) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L2_3, Givedots
										.setall(2, 3, challenge.enLineMap_defaultchallange
												.get(enLine.L2_3)
												.getRepnum() + 1));

				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L2_3,
							Givedots.setall(2, 3, 1));
				}
				break;
			case 4:
				if (challenge.enLineMap_defaultchallange.get(enLine.L2_4) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L2_4, Givedots
										.setall(2, 4, challenge.enLineMap_defaultchallange
												.get(enLine.L2_4)
												.getRepnum() + 1));

				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L2_4,
							Givedots.setall(2, 4, 1));
				}
				break;
			case 5:
				if (challenge.enLineMap_defaultchallange.get(enLine.L2_5) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L2_5, Givedots
										.setall(2, 5, challenge.enLineMap_defaultchallange
												.get(enLine.L2_5)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L2_5,
							Givedots.setall(2, 5, 1));
				}
				break;
			case 6:
				if (challenge.enLineMap_defaultchallange.get(enLine.L2_6) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L2_6, Givedots
										.setall(2, 6, challenge.enLineMap_defaultchallange
												.get(enLine.L2_6)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L2_6,
							Givedots.setall(2, 6, 1));
				}
				break;
			case 7:
				if (challenge.enLineMap_defaultchallange.get(enLine.L2_7) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L2_7, Givedots
										.setall(2, 7, challenge.enLineMap_defaultchallange
												.get(enLine.L2_7)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L2_7,
							Givedots.setall(2, 7, 1));
				}
				break;
			case 8:
				if (challenge.enLineMap_defaultchallange.get(enLine.L2_8) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L2_8, Givedots
										.setall(2, 8, challenge.enLineMap_defaultchallange
												.get(enLine.L2_8)
												.getRepnum() + 1));

				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L2_8,
							Givedots.setall(2, 8, 1));
				}
				break;
			case 9:
				if (challenge.enLineMap_defaultchallange.get(enLine.L2_9) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L2_9, Givedots
										.setall(2, 9, challenge.enLineMap_defaultchallange
												.get(enLine.L2_9)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L2_9,
							Givedots.setall(2, 9, 1));
				}
				break;
			default:
				break;
			}
			break;
		case 3:
			switch (y) {

			case 4:
				if (challenge.enLineMap_defaultchallange.get(enLine.L3_4) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L3_4, Givedots
										.setall(3, 4, challenge.enLineMap_defaultchallange
												.get(enLine.L3_4)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L3_4,
							Givedots.setall(3, 4, 1));
				}
				break;
			case 5:
				if (challenge.enLineMap_defaultchallange.get(enLine.L3_5) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L3_5, Givedots
										.setall(3, 5, challenge.enLineMap_defaultchallange
												.get(enLine.L3_5)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L3_5,
							Givedots.setall(3, 5, 1));
				}
				break;
			case 6:
				if (challenge.enLineMap_defaultchallange.get(enLine.L3_6) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L3_6, Givedots
										.setall(3, 6, challenge.enLineMap_defaultchallange
												.get(enLine.L3_6)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L3_6,
							Givedots.setall(3, 6, 1));
				}
				break;
			case 7:
				if (challenge.enLineMap_defaultchallange.get(enLine.L3_7) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L3_7, Givedots
										.setall(3, 7, challenge.enLineMap_defaultchallange
												.get(enLine.L3_7)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L3_7,
							Givedots.setall(3, 7, 1));
				}
				break;
			case 8:
				if (challenge.enLineMap_defaultchallange.get(enLine.L3_8) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L3_8, Givedots
										.setall(3, 8, challenge.enLineMap_defaultchallange
												.get(enLine.L3_8)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L3_8,
							Givedots.setall(3, 8, 1));
				}
				break;
			case 9:
				if (challenge.enLineMap_defaultchallange.get(enLine.L3_9) != null) {
	
						challenge.enLineMap_defaultchallange
								.put(enLine.L3_9, Givedots
										.setall(3, 9, challenge.enLineMap_defaultchallange
												.get(enLine.L3_9)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L3_9,
							Givedots.setall(3, 9, 1));
				}
				break;
			default:
				break;
			}
			break;
		case 4:
			switch (y) {

			case 5:
				if (challenge.enLineMap_defaultchallange.get(enLine.L4_5) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L4_5, Givedots
										.setall(4, 5, challenge.enLineMap_defaultchallange
												.get(enLine.L4_5)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L4_5,
							Givedots.setall(4, 5, 1));
				}
				break;
			case 6:
				if (challenge.enLineMap_defaultchallange.get(enLine.L4_6) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L4_6, Givedots
										.setall(4, 6, challenge.enLineMap_defaultchallange
												.get(enLine.L4_6)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L4_6,
							Givedots.setall(4, 6, 1));
				}
				break;
			case 7:
				if (challenge.enLineMap_defaultchallange.get(enLine.L4_7) != null) {
	
						challenge.enLineMap_defaultchallange
								.put(enLine.L4_7, Givedots
										.setall(4, 7, challenge.enLineMap_defaultchallange
												.get(enLine.L4_7)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L4_7,
							Givedots.setall(4, 7, 1));
				}
				break;
			case 8:
				if (challenge.enLineMap_defaultchallange.get(enLine.L4_8) != null) {
	
						challenge.enLineMap_defaultchallange
								.put(enLine.L4_8, Givedots
										.setall(4, 8, challenge.enLineMap_defaultchallange
												.get(enLine.L4_8)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L4_8,
							Givedots.setall(4, 8, 1));
				}
				break;
			case 9:
				if (challenge.enLineMap_defaultchallange.get(enLine.L4_9) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L4_9, Givedots
										.setall(4, 9, challenge.enLineMap_defaultchallange
												.get(enLine.L4_9)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L4_9,
							Givedots.setall(4, 9, 1));
				}
				break;
			default:
				break;
			}
			break;
		case 5:
			switch (y) {

			case 6:
				if (challenge.enLineMap_defaultchallange.get(enLine.L5_6) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L5_6, Givedots
										.setall(5, 6, challenge.enLineMap_defaultchallange
												.get(enLine.L5_6)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L5_6,
							Givedots.setall(5, 6, 1));
				}
				break;
			case 7:
				if (challenge.enLineMap_defaultchallange.get(enLine.L5_7) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L5_7, Givedots
										.setall(5, 7, challenge.enLineMap_defaultchallange
												.get(enLine.L5_7)
												.getRepnum() + 1));

				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L5_7,
							Givedots.setall(5, 7, 1));
				}
				break;
			case 8:
				if (challenge.enLineMap_defaultchallange.get(enLine.L5_8) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L5_8, Givedots
										.setall(5, 8, challenge.enLineMap_defaultchallange
												.get(enLine.L5_8)
												.getRepnum() + 1));

				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L5_8,
							Givedots.setall(5, 8, 1));
				}
				break;
			case 9:
				if (challenge.enLineMap_defaultchallange.get(enLine.L5_9) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L5_9, Givedots
										.setall(5, 9, challenge.enLineMap_defaultchallange
												.get(enLine.L5_9)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L5_9,
							Givedots.setall(5, 9, 1));
				}
				break;
			default:
				break;
			}
			break;
		case 6:
			switch (y) {

			case 7:
				if (challenge.enLineMap_defaultchallange.get(enLine.L6_7) != null) {
		
						challenge.enLineMap_defaultchallange
								.put(enLine.L6_7, Givedots
										.setall(6, 7, challenge.enLineMap_defaultchallange
												.get(enLine.L6_7)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L6_7,
							Givedots.setall(6, 7, 1));
				}
				break;
			case 8:
				if (challenge.enLineMap_defaultchallange.get(enLine.L6_8) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L6_8, Givedots
										.setall(6, 8, challenge.enLineMap_defaultchallange
												.get(enLine.L6_8)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L6_8,
							Givedots.setall(6, 8, 1));
				}
				break;
			case 9:
				if (challenge.enLineMap_defaultchallange.get(enLine.L6_9) != null) {
	
						challenge.enLineMap_defaultchallange
								.put(enLine.L6_9, Givedots
										.setall(6, 9, challenge.enLineMap_defaultchallange
												.get(enLine.L6_9)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L6_9,
							Givedots.setall(6, 9, 1));
				}
				break;
			default:
				break;
			}
			break;
		case 7:
			switch (y) {

			case 8:
				if (challenge.enLineMap_defaultchallange.get(enLine.L7_8) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L7_8, Givedots
										.setall(7, 8, challenge.enLineMap_defaultchallange
												.get(enLine.L7_8)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L7_8,
							Givedots.setall(7, 8, 1));
				}
				break;
			case 9:
				if (challenge.enLineMap_defaultchallange.get(enLine.L7_9) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L7_9, Givedots
										.setall(7, 9, challenge.enLineMap_defaultchallange
												.get(enLine.L7_9)
												.getRepnum() + 1));


				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L7_9,
							Givedots.setall(7, 9, 1));
				}
				break;
			default:
				break;
			}
			break;
		case 8:
			switch (y) {

			case 9:
				if (challenge.enLineMap_defaultchallange.get(enLine.L8_9) != null) {

						challenge.enLineMap_defaultchallange
								.put(enLine.L8_9, Givedots
										.setall(8, 9, challenge.enLineMap_defaultchallange
												.get(enLine.L8_9)
												.getRepnum() + 1));

				} else {
					challenge.enLineMap_defaultchallange.put(enLine.L8_9,
							Givedots.setall(8, 9, 1));
				}
				break;
			default:
				break;
			}
			break;

		default:
			break;
		}

	}
}