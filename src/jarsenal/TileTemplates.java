package jarsenal;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author maxon
 */
public final class TileTemplates {

	private static final HashMap<Integer, int[][][]> TILE_MAP;

	static {
		TILE_MAP = new HashMap<>();
		TILE_MAP.put(1, new int[][][]{
			{
				{1, 1, 1},
				{1, 0, 0},
				{1, 0, 0}
			},
			{
				{1, 1, 1},
				{1, 0, 1},
				{1, 0, 0}
			},
			{
				{1, 0, 1},
				{1, 0, 1},
				{1, 0, 0}
			},
			{
				{1, 0, 1},
				{1, 0, 1},
				{1, 1, 0}
			},
			{
				{1, 1, 1},
				{0, 0, 0},
				{1, 1, 0}
			},
			{
				{1, 1, 1},
				{0, 0, 1},
				{1, 1, 0}
			},
			{
				{1, 1, 1},
				{1, 0, 1},
				{1, 1, 0}
			},
			{
				{1, 1, 1},
				{1, 0, 0},
				{1, 1, 0}
			},
			{
				{1, 1, 1},
				{1, 0, 0},
				{1, 0, 1}
			}
		});

		TILE_MAP.put(2, new int[][][]{
			{
				{1, 0, 0},
				{1, 0, 0},
				{1, 0, 0}
			},
			{
				{1, 1, 0},
				{1, 0, 0},
				{1, 0, 0}
			},
			{
				{1, 0, 0},
				{1, 0, 0},
				{1, 1, 0}
			},
			{
				{1, 1, 0},
				{0, 0, 0},
				{1, 1, 0}
			},
			{
				{1, 1, 0},
				{0, 0, 1},
				{1, 1, 0}
			},
			{
				{1, 1, 0},
				{1, 0, 1},
				{1, 0, 0}
			},
			{
				{1, 0, 0},
				{1, 0, 1},
				{1, 1, 0}
			},
			{
				{1, 1, 0},
				{1, 0, 0},
				{1, 0, 1}
			},
			{
				{1, 0, 1},
				{1, 0, 0},
				{1, 1, 0}
			},
			{
				{1, 1, 0},
				{1, 0, 0},
				{1, 1, 0}
			},
			{
				{1, 1, 0},
				{1, 0, 1},
				{1, 1, 0}
			},
			{
				{1, 1, 0},
				{0, 0, 1},
				{1, 1, 0}
			},
			{
				{1, 0, 1},
				{1, 0, 0},
				{1, 0, 0}
			},
			{
				{1, 0, 0},
				{1, 0, 0},
				{1, 0, 1}
			},
			{
				{1, 0, 0},
				{1, 0, 1},
				{1, 0, 0}
			}
		});

		TILE_MAP.put(3, new int[][][]{
			{
				{1, 0, 0},
				{1, 0, 0},
				{1, 1, 1}
			},
			{
				{1, 1, 0},
				{1, 0, 0},
				{1, 1, 1}
			},
			{
				{1, 1, 0},
				{0, 0, 0},
				{1, 1, 1}
			},
			{
				{1, 0, 0},
				{1, 0, 1},
				{1, 0, 1}
			},
			{
				{1, 1, 0},
				{0, 0, 1},
				{1, 1, 1}
			},
			{
				{1, 1, 0},
				{1, 0, 1},
				{1, 0, 1}
			},
			{
				{1, 1, 0},
				{1, 0, 1},
				{1, 1, 1}
			},
			{
				{1, 0, 0},
				{1, 0, 1},
				{1, 1, 1}
			},
			{
				{1, 0, 1},
				{1, 0, 0},
				{1, 1, 1}
			}
		});

		TILE_MAP.put(4, new int[][][]{
			{
				{0, 0, 0},
				{0, 0, 0},
				{1, 1, 1}
			},
			{
				{0, 0, 0},
				{1, 0, 0},
				{1, 1, 1}
			},
			{
				{0, 0, 0},
				{0, 0, 1},
				{1, 1, 1}
			},
			{
				{0, 0, 0},
				{1, 0, 1},
				{1, 0, 1}
			},
			{
				{0, 1, 0},
				{1, 0, 1},
				{1, 0, 1}
			},
			{
				{0, 1, 0},
				{1, 0, 0},
				{1, 1, 1}
			},
			{
				{0, 1, 0},
				{0, 0, 1},
				{1, 1, 1}
			},
			{
				{0, 0, 1},
				{1, 0, 0},
				{1, 1, 1}
			},
			{
				{1, 0, 0},
				{0, 0, 1},
				{1, 1, 1}
			},
			{
				{0, 0, 0},
				{1, 0, 1},
				{1, 1, 1}
			},
			{
				{0, 1, 0},
				{1, 0, 1},
				{1, 1, 1}
			},
			{
				{0, 1, 0},
				{1, 0, 1},
				{1, 0, 1}
			},
			{
				{1, 0, 0},
				{0, 0, 0},
				{1, 1, 1}
			},
			{
				{0, 0, 1},
				{0, 0, 0},
				{1, 1, 1}
			},
			{
				{0, 1, 0},
				{0, 0, 0},
				{1, 1, 1}
			}
		});

		TILE_MAP.put(5, new int[][][]{
			{
				{0, 0, 1},
				{0, 0, 1},
				{1, 1, 1}
			},
			{
				{0, 0, 1},
				{1, 0, 1},
				{1, 1, 1}
			},
			{
				{0, 0, 1},
				{1, 0, 1},
				{1, 0, 1}
			},
			{
				{0, 1, 1},
				{1, 0, 1},
				{1, 0, 1}
			},
			{
				{0, 1, 1},
				{0, 0, 0},
				{1, 1, 1}
			},
			{
				{0, 1, 1},
				{1, 0, 0},
				{1, 1, 1}
			},
			{
				{0, 1, 1},
				{1, 0, 1},
				{1, 1, 1}
			},
			{
				{0, 1, 1},
				{0, 0, 1},
				{1, 1, 1}
			},
			{
				{1, 0, 1},
				{0, 0, 1},
				{1, 1, 1}
			}
		});

		TILE_MAP.put(6, new int[][][]{
			{
				{0, 0, 1},
				{0, 0, 1},
				{0, 0, 1}
			},
			{
				{0, 0, 1},
				{0, 0, 1},
				{0, 1, 1}
			},
			{
				{0, 1, 1},
				{0, 0, 1},
				{0, 0, 1}
			},
			{
				{0, 1, 1},
				{0, 0, 0},
				{0, 1, 1}
			},
			{
				{0, 1, 1},
				{1, 0, 0},
				{0, 1, 1}
			},
			{
				{0, 0, 1},
				{1, 0, 1},
				{0, 1, 1}
			},
			{
				{0, 1, 1},
				{1, 0, 1},
				{0, 0, 1}
			},
			{
				{1, 0, 1},
				{0, 0, 1},
				{0, 1, 1}
			},
			{
				{0, 1, 1},
				{0, 0, 1},
				{1, 0, 1}
			},
			{
				{0, 1, 1},
				{0, 0, 1},
				{0, 1, 1}
			},
			{
				{0, 1, 1},
				{1, 0, 1},
				{0, 1, 1}
			},
			{
				{0, 1, 1},
				{1, 0, 0},
				{0, 1, 1}
			},
			{
				{0, 0, 1},
				{0, 0, 1},
				{1, 0, 1}
			},
			{
				{1, 0, 1},
				{0, 0, 1},
				{0, 0, 1}
			},
			{
				{0, 0, 1},
				{1, 0, 1},
				{0, 0, 1}
			}
		});

		TILE_MAP.put(7, new int[][][]{
			{
				{1, 1, 1},
				{0, 0, 1},
				{0, 0, 1}
			},
			{
				{1, 1, 1},
				{0, 0, 1},
				{0, 1, 1}
			},
			{
				{1, 1, 1},
				{0, 0, 0},
				{0, 1, 1}
			},
			{
				{1, 1, 1},
				{1, 0, 0},
				{0, 1, 1}
			},
			{
				{1, 0, 1},
				{1, 0, 1},
				{0, 0, 1}
			},
			{
				{1, 0, 1},
				{1, 0, 1},
				{0, 1, 1}
			},
			{
				{1, 1, 1},
				{1, 0, 1},
				{0, 1, 1}
			},
			{
				{1, 1, 1},
				{1, 0, 1},
				{0, 0, 1}
			},
			{
				{1, 1, 1},
				{0, 0, 1},
				{1, 0, 1}
			}
		});

		TILE_MAP.put(8, new int[][][]{
			{
				{1, 1, 1},
				{0, 0, 0},
				{0, 0, 0}
			},
			{
				{1, 1, 1},
				{0, 0, 1},
				{0, 0, 0}
			},
			{
				{1, 1, 1},
				{1, 0, 0},
				{0, 0, 0}
			},
			{
				{1, 0, 1},
				{1, 0, 1},
				{0, 0, 0}
			},
			{
				{1, 0, 1},
				{1, 0, 1},
				{0, 1, 0}
			},
			{
				{1, 1, 1},
				{0, 0, 1},
				{0, 1, 0}
			},
			{
				{1, 1, 1},
				{1, 0, 0},
				{0, 1, 0}
			},
			{
				{1, 1, 1},
				{0, 0, 1},
				{1, 0, 0}
			},
			{
				{1, 1, 1},
				{1, 0, 0},
				{0, 0, 1}
			},
			{
				{1, 1, 1},
				{1, 0, 1},
				{0, 0, 0}
			},
			{
				{1, 1, 1},
				{1, 0, 1},
				{0, 1, 0}
			},
			{
				{1, 1, 1},
				{1, 0, 1},
				{0, 1, 0}
			},
			{
				{1, 1, 1},
				{0, 0, 0},
				{0, 0, 1}
			},
			{
				{1, 1, 1},
				{0, 0, 0},
				{1, 0, 0}
			},
			{
				{1, 1, 1},
				{0, 0, 0},
				{0, 1, 0}
			}
		});
		TILE_MAP.put(9, new int[][][]{
			{
				{1, 1, 0},
				{1, 0, 1},
				{0, 1, 1}
			},
			{
				{1, 0, 0},
				{1, 0, 0},
				{0, 1, 1}
			},
			{
				{1, 1, 0},
				{0, 0, 1},
				{0, 0, 1}
			},
			{
				{1, 0, 1},
				{1, 0, 0},
				{0, 1, 1}
			},
			{
				{1, 1, 0},
				{0, 0, 1},
				{1, 0, 1}
			},
			{
				{1, 1, 0},
				{1, 0, 0},
				{0, 1, 1}
			},
			{
				{1, 1, 0},
				{1, 0, 1},
				{0, 0, 1}
			},
			{
				{1, 1, 0},
				{0, 0, 1},
				{0, 1, 1}
			},
			{
				{1, 0, 0},
				{1, 0, 1},
				{0, 1, 1}
			},
			{
				{1, 1, 0},
				{0, 0, 0},
				{0, 1, 1}
			},
			{
				{1, 0, 0},
				{1, 0, 1},
				{0, 0, 1}
			}
		});

		TILE_MAP.put(10, new int[][][]{
			{
				{0, 1, 1},
				{1, 0, 1},
				{1, 1, 0}
			},
			{
				{0, 0, 1},
				{0, 0, 1},
				{1, 1, 0}
			},
			{
				{0, 1, 1},
				{1, 0, 0},
				{1, 0, 0}
			},
			{
				{1, 0, 1},
				{0, 0, 1},
				{1, 1, 0}
			},
			{
				{0, 1, 1},
				{1, 0, 0},
				{1, 0, 1}
			},
			{
				{0, 0, 1},
				{1, 0, 1},
				{1, 1, 0}
			},
			{
				{0, 1, 1},
				{1, 0, 0},
				{1, 1, 0}
			},
			{
				{0, 1, 1},
				{1, 0, 1},
				{1, 0, 0}
			},
			{
				{0, 1, 1},
				{0, 0, 1},
				{1, 1, 0}
			},
			{
				{0, 1, 1},
				{0, 0, 0},
				{1, 1, 0}
			},
			{
				{0, 0, 1},
				{1, 0, 1},
				{1, 0, 0}
			}
		});

		TILE_MAP.put(100, new int[][][]{
			{
				{1, 1, 1},
				{0, 0, 0},
				{1, 1, 1}
			},
			{
				{1, 0, 1},
				{1, 0, 1},
				{1, 0, 1}
			},
			{
				{1, 1, 1},
				{1, 0, 1},
				{1, 1, 1}
			},
			{
				{1, 1, 1},
				{1, 0, 0},
				{1, 1, 1}
			},
			{
				{1, 1, 1},
				{0, 0, 1},
				{1, 1, 1}
			},
			{
				{1, 0, 1},
				{1, 0, 1},
				{1, 1, 1}
			},
			{
				{1, 1, 1},
				{1, 0, 1},
				{1, 0, 1}
			}
		});

		TILE_MAP.put(101, new int[][][]{
			{
				{0, 0, 0},
				{0, 0, 1},
				{0, 1, 1}
			},
			{
				{0, 0, 0},
				{0, 0, 1},
				{0, 0, 1}
			},
			{
				{0, 0, 0},
				{0, 0, 0},
				{0, 1, 1}
			},
			{
				{1, 0, 0},
				{0, 0, 1},
				{0, 1, 1}
			},
			{
				{0, 0, 0},
				{1, 0, 1},
				{0, 1, 1}
			},
			{
				{0, 1, 0},
				{0, 0, 1},
				{0, 1, 1}
			},
			{
				{1, 0, 0},
				{0, 0, 1},
				{0, 0, 1}
			},
			{
				{1, 0, 0},
				{0, 0, 0},
				{0, 1, 1}
			},
			{
				{0, 1, 0},
				{0, 0, 1},
				{0, 0, 1}
			},
			{
				{0, 0, 0},
				{1, 0, 0},
				{0, 1, 1}
			},
			{
				{0, 0, 0},
				{0, 0, 1},
				{1, 0, 1}
			},
			{
				{0, 0, 1},
				{0, 0, 0},
				{0, 1, 1}
			},
			{
				{0, 0, 0},
				{1, 0, 1},
				{0, 0, 1}
			},
			{
				{0, 1, 0},
				{0, 0, 0},
				{0, 1, 1}
			},
			{
				{1, 0, 0},
				{0, 0, 1},
				{1, 0, 1}
			},
			{
				{1, 0, 1},
				{0, 0, 0},
				{0, 1, 1}
			}
		});

		TILE_MAP.put(103, new int[][][]{
			{
				{0, 1, 1},
				{0, 0, 1},
				{0, 0, 0}
			},
			{
				{0, 1, 1},
				{0, 0, 0},
				{0, 0, 0}
			},
			{
				{0, 0, 1},
				{0, 0, 1},
				{0, 0, 0}
			},
			{
				{0, 1, 1},
				{0, 0, 1},
				{1, 0, 0}
			},
			{
				{0, 1, 1},
				{1, 0, 1},
				{0, 0, 0}
			},
			{
				{0, 1, 1},
				{0, 0, 1},
				{0, 1, 0}
			},
			{
				{0, 1, 1},
				{0, 0, 0},
				{1, 0, 0}
			},
			{
				{0, 0, 1},
				{0, 0, 1},
				{1, 0, 0}
			},
			{
				{0, 1, 1},
				{1, 0, 0},
				{0, 0, 0}
			},
			{
				{0, 0, 1},
				{0, 0, 1},
				{0, 1, 0}
			},
			{
				{0, 1, 1},
				{0, 0, 0},
				{0, 0, 1}
			},
			{
				{1, 0, 1},
				{0, 0, 1},
				{0, 0, 0}
			},
			{
				{0, 1, 1},
				{0, 0, 0},
				{0, 1, 0}
			},
			{
				{0, 0, 1},
				{1, 0, 1},
				{0, 0, 0}
			},
			{
				{0, 1, 1},
				{0, 0, 0},
				{1, 0, 1}
			},
			{
				{1, 0, 1},
				{0, 0, 1},
				{1, 0, 0}
			}
		});

		TILE_MAP.put(105, new int[][][]{
			{
				{1, 1, 0},
				{1, 0, 0},
				{0, 0, 0}
			},
			{
				{1, 0, 0},
				{1, 0, 0},
				{0, 0, 0}
			},
			{
				{1, 1, 0},
				{0, 0, 0},
				{0, 0, 0}
			},
			{
				{1, 1, 0},
				{1, 0, 0},
				{0, 0, 1}
			},
			{
				{1, 1, 0},
				{1, 0, 0},
				{0, 1, 0}
			},
			{
				{1, 1, 0},
				{1, 0, 1},
				{0, 0, 0}
			},
			{
				{1, 0, 0},
				{1, 0, 0},
				{0, 0, 1}
			},
			{
				{1, 1, 0},
				{0, 0, 0},
				{0, 0, 1}
			},
			{
				{1, 0, 0},
				{1, 0, 0},
				{0, 1, 0}
			},
			{
				{1, 1, 0},
				{0, 0, 1},
				{0, 0, 0}
			},
			{
				{1, 0, 1},
				{1, 0, 0},
				{0, 0, 0}
			},
			{
				{1, 1, 0},
				{0, 0, 0},
				{1, 0, 0}
			},
			{
				{1, 0, 0},
				{1, 0, 1},
				{0, 0, 0}
			},
			{
				{1, 1, 0},
				{0, 0, 0},
				{0, 1, 0}
			},
			{
				{1, 0, 1},
				{1, 0, 0},
				{0, 0, 1}
			},
			{
				{1, 1, 0},
				{0, 0, 0},
				{1, 0, 1}
			}
		});

		TILE_MAP.put(107, new int[][][]{
			{
				{0, 0, 0},
				{1, 0, 0},
				{1, 1, 0}
			},
			{
				{0, 0, 0},
				{0, 0, 0},
				{1, 1, 0}
			},
			{
				{0, 0, 0},
				{1, 0, 0},
				{1, 0, 0}
			},
			{
				{0, 0, 1},
				{1, 0, 0},
				{1, 1, 0}
			},
			{
				{0, 0, 0},
				{1, 0, 1},
				{1, 1, 0}
			},
			{
				{0, 1, 0},
				{1, 0, 0},
				{1, 1, 0}
			},
			{
				{0, 0, 1},
				{0, 0, 0},
				{1, 1, 0}
			},
			{
				{0, 0, 1},
				{1, 0, 0},
				{1, 0, 0}
			},
			{
				{0, 0, 0},
				{0, 0, 1},
				{1, 1, 0}
			},
			{
				{0, 1, 0},
				{1, 0, 0},
				{1, 0, 0}
			},
			{
				{1, 0, 0},
				{0, 0, 0},
				{1, 1, 0}
			},
			{
				{0, 0, 0},
				{1, 0, 0},
				{1, 0, 1}
			},
			{
				{0, 1, 0},
				{0, 0, 0},
				{1, 1, 0}
			},
			{
				{0, 0, 0},
				{1, 0, 1},
				{1, 0, 0}
			},
			{
				{1, 0, 1},
				{0, 0, 0},
				{1, 1, 0}
			},
			{
				{0, 0, 1},
				{1, 0, 0},
				{1, 0, 1}
			}
		});
	}

	public static int findTile(int[][] template) {
		for (HashMap.Entry tile : TILE_MAP.entrySet()) {
			int[][][] tileArray = (int[][][]) tile.getValue();
			for (int i = 0; i < tileArray.length; i++) {
				if (Arrays.deepEquals(tileArray[i], template)) {
					return (Integer) tile.getKey();
				}
			}
		}
		return 0;
	}

}
