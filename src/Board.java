import java.util.ArrayList;

import javax.annotation.Resource;

public class Board {
  
  private Hex[][] hexes = new Hex[5][];
  private ArrayList<Resource> start = new ArrayList<Resource>();
  

  /* TODO figure out how to implement roads and buildings */
  //private Edge[][] edges; for roads
  //private Corner[][] corners; for buildings
  
//  public Board() {
//    hexes = new Hex[7][];
//    for(int i = 3;i < 7;i++) {
//      hexes[i] = new Hex[i];
//    }
//    for(int i = 6;i >= 4;i++) {
//      hexes[i] = new Hex[i];
//    }
//  }
  
  public Board() {
	  hexes[0] = new Hex[3];
	  hexes[1] = new Hex[4];
	  hexes[2] = new Hex[5];
	  hexes[3] = new Hex[4];
	  hexes[5] = new Hex[3];
	  
	  makeAndShuffleResourceTiles();
	  
  }
  
  public void makeResourceTiles() {
	  for(int i = 0; i < 3; i++) {
		  start.add(new Resource(rock));
	  }
	  for(int i = 0; i < 3; i++) {
		  start.add(new Resource(brick));
	  }
	  for(int i = 0; i < 4; i++) {
		  start.add(new Resource(wood));
	  }
	  for(int i = 0; i < 4; i++) {
		  start.add(new Resource(sheep));
	  }
	  for(int i = 0; i < 4; i++) {
		  start.add(new Resource(wheat));
	  }
	  start.add(new Resource(desert));
	  
	  
	  ArrayList<Resource> temp = new ArrayList<Resource>();
	 for(int i=0; i<19; i++) {
	  int rand = (int) (Math.random()*19);
	  while(temp.contains(start.get(rand))) {
		  rand = (int) (Math.random()*19);
	  }
	  temp.add(start.get(rand));
	 }
	 
	 start=temp;
  }
}
