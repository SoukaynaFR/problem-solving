import java.util.ArrayList;

class CombinationSum2 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        dfs(candidates, target, 0, new ArrayList<>(), result);
    return result;
    }

    private void dfs(int[] candidates, int target, int start, 
                 List<Integer> comb, List<List<Integer>> result) {
    // Base case: exact match
    if (target == 0) {
        result.add(new ArrayList<>(comb)); // add a copy of the combination
        return;
    }
    // Base case: overshoot
    if (target < 0) {
        return; // stop exploring this branch
    }
    // Explore candidates starting from 'start'
    for (int i = start; i < candidates.length; i++) {
        comb.add(candidates[i]); // choose candidate[i]
        dfs(candidates, target - candidates[i], i, comb, result); // recurse (can reuse the same i)
        comb.remove(comb.size() - 1); // backtrack: undo choice
    }
}

}