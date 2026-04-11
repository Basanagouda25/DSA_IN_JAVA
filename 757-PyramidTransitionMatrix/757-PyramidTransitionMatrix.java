// Last updated: 4/11/2026, 12:48:18 PM
class Solution {
    public boolean pyramidTransition(String bottom, List<String> allowed) {
	Set<Character>[][] map = new Set[7][7];

	for (String triple : allowed) {
		int i = triple.charAt(0) - 'A', j = triple.charAt(1) - 'A';
		if (map[i][j] == null) map[i][j] = new HashSet<>();

		map[i][j].add(triple.charAt(2));
	}

	return dfs(map, bottom, "", 0);
}

private boolean dfs(Set<Character>[][] map, String bottom, String top, int k) {
	if (bottom.length() == 1) return true;

	if (k == bottom.length() - 1) return dfs(map, top, "", 0);

	int i = bottom.charAt(k) - 'A', j = bottom.charAt(k + 1) - 'A';
	if (map[i][j] == null) return false;

	for (char candidate : map[i][j]) {
		if (dfs(map, bottom, top + candidate, k + 1)) return true;
	}

	return false;
    }
}