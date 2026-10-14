import java.util.*;

class ThroneInheritance {

    private String kingName;
    private Map<String, List<String>> familyTree;
    private Set<String> deadSet;

    public ThroneInheritance(String kingName) {
        this.kingName = kingName;
        this.familyTree = new HashMap<>();
        this.deadSet = new HashSet<>();
        
        familyTree.put(kingName, new ArrayList<>());
    }
    
    public void birth(String parentName, String childName) {
        familyTree.computeIfAbsent(parentName, k -> new ArrayList<>()).add(childName);
        familyTree.putIfAbsent(childName, new ArrayList<>());
    }
    
    public void death(String name) {
        deadSet.add(name);
    }
    
    public List<String> getInheritanceOrder() {
        List<String> order = new ArrayList<>();
        dfs(kingName, order);
        return order;
    }
    
    private void dfs(String current, List<String> order) {
        if (!deadSet.contains(current)) {
            order.add(current);
        }
        
        List<String> children = familyTree.get(current);
        if (children != null) {
            for (String child : children) {
                dfs(child, order);
            }
        }
    }
}

Output:
["ThroneInheritance","birth","birth","birth","birth","birth","birth","getInheritanceOrder","death","getInheritanceOrder"]
[["king"],["king","andy"],["king","bob"],["king","catherine"],["andy","matthew"],["bob","alex"],["bob","asha"],[null],["bob"],[null]]

[null,null,null,null,null,null,null,["king","andy","matthew","bob","alex","asha","catherine"],null,["king","andy","matthew","alex","asha","catherine"]]
