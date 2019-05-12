class GraphicalElement extends Component {
    public GraphicalElement (
        String ID,
        int naturalSize,
        int shrinkability,
        int stretchability,
        String content
    ) {
        this.ID = ID;
        this.naturalSize = naturalSize;
        this.shrinkability = shrinkability;
        this.stretchability = stretchability;
        this.content = content;
    }
}
