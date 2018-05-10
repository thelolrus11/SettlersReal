import java.util.ArrayList;

public class TerrainHex implements Hex {

	private Resource.Material resource;
	private Building[] buildings;
	private int trigger;
	private ArrayList<Location> vertices;


	public TerrainHex(Resource.Material resource,int trigger, int arrayRow, int arrayCol) {
		super();
		this.resource = resource;
		this.trigger = trigger;

		buildings = new Building[];
		for(int i = 0;i < buildings.length;i++) {
			buildings[i] = new Building();
		}
		//fill vertices counterclockwise on hexagon
		setVertices(arrayRow, arrayCol);




	}

	public Resource.Material getResource() { return resource; }

	public boolean matchesRoll(int roll) { return trigger==roll; }

	public void addResources() {
		for(Building b:buildings) {
			b.give(resource);
		}
	}
	public void setVertices(int arrayRow, int arrayCol) {
		if(arrayRow == 0) {
			vertices.add(new Location(0,arrayCol));
			vertices.add(new Location(1,arrayCol));
			vertices.add(new Location(2,arrayCol));
			vertices.add(new Location(3,1 + arrayCol));
			vertices.add(new Location(2,1 + arrayCol));
			vertices.add(new Location(1,1 + arrayCol));

		}
		else if(arrayRow == 1) {
			vertices.add(new Location(2,arrayCol));
			vertices.add(new Location(3,arrayCol));
			vertices.add(new Location(4,arrayCol));
			vertices.add(new Location(5,1 + arrayCol));
			vertices.add(new Location(4,1 + arrayCol));
			vertices.add(new Location(3,1 + arrayCol));
		}
		else if(arrayRow == 2) {
			vertices.add(new Location(4,arrayCol));
			vertices.add(new Location(5,arrayCol));
			vertices.add(new Location(6,arrayCol));
			vertices.add(new Location(7,arrayCol));
			vertices.add(new Location(6,1 + arrayCol));
			vertices.add(new Location(5,1 + arrayCol));
		}
		else if(arrayRow == 3) {
			vertices.add(new Location(6,arrayCol));
			vertices.add(new Location(7,arrayCol));
			vertices.add(new Location(8,arrayCol));
			vertices.add(new Location(9,arrayCol));
			vertices.add(new Location(8,1 + arrayCol));
			vertices.add(new Location(7,1 + arrayCol));
		}
		else if(arrayRow == 2) {
			vertices.add(new Location(8,arrayCol));
			vertices.add(new Location(9,arrayCol));
			vertices.add(new Location(10,arrayCol));
			vertices.add(new Location(11,arrayCol));
			vertices.add(new Location(10,1 + arrayCol));
			vertices.add(new Location(9,1 + arrayCol));
		}
	}

	public void upgradeBuilding(int corner) { buildings[corner].upgrade(); }

}
