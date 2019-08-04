package _06_Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake {
	public static final Color SNAKE_COLOR = Color.BLUE;
	public static final int BODY_SIZE = 50;

	private SnakeSegment head;
	private ArrayList<SnakeSegment> snake;

	private Direction currentDirection;

	private boolean canMove = true;

	public Snake(Location location) {
		snake = new ArrayList<SnakeSegment>();
		head = new SnakeSegment(location, BODY_SIZE);
		snake.add(head);

		currentDirection = Direction.RIGHT;
	}

	public void feed() {
		//1. add a new SnakeSegment object to the snake
		switch(currentDirection) {
		case UP:
			Location body = new Location(head.getLocation().x , head.getLocation().y++);
			SnakeSegment s = new SnakeSegment(body, BODY_SIZE);
			snake.add(s);
			break;
		case DOWN:
			Location body2 = new Location( head.getLocation().y, head.getLocation().y--);
			SnakeSegment s2 = new SnakeSegment(body2, BODY_SIZE);
			snake.add(s2);
			break;
		case RIGHT:
			Location body3 = new Location(head.getLocation().x--, head.getLocation().y);
			SnakeSegment s3 = new SnakeSegment(body3, BODY_SIZE);
			snake.add(s3);	
			break;
		case LEFT:
			Location body4 = new Location(head.getLocation().x++, head.getLocation().y);
			SnakeSegment s4 = new SnakeSegment(body4, BODY_SIZE);
			snake.add(s4);
			break;
	}
	
}	
	

	public Location getHeadLocation() {
		//2. return the location of the snake's head
		return head.getLocation();
	}

	public void update() {
		//1. use a switch statement to check on the currentDirection
		//   of the snake and calculate its next x and y position.
		switch(currentDirection) {
			case UP:
				Location hl = head.getLocation();
				//hl.y--;
				System.out.println();
				for(SnakeSegment ss: snake) {
					ss.getLocation().y--;
				}
				break;
			case DOWN:
				Location hl2 = head.getLocation();
				//hl2.y++;
				for(SnakeSegment ss: snake) {
					ss.getLocation().y++;
				}
				break;
			case RIGHT:
				Location hl3 = head.getLocation();
				//hl3.x++;
				for(SnakeSegment ss: snake) {
					ss.getLocation().x++;
				}
				break;
			case LEFT:
				Location hl4 = head.getLocation();
				//hl4.x--;
				for(SnakeSegment ss: snake) {
					ss.getLocation().x--;
				}
				break;
				
		}
		canMove = true;
		System.out.println(head.getLocation().x);
		System.out.println(head.getLocation().y);
		System.out.println();

		//2. Iterate through the SnakeSegments in reverse order
		//2a. Update each snake segment to the location of the segment 
		//    in front of it.
		
		
		//3. set the location of the head to the new location calculated in step 1
		

		//4. set canMove to true
		
	}

	public void setDirection(Direction d) {
		//1. set the current direction equal to the passed in Direction only if canMove is true.
		//   set canMove equal to false.
		//   make sure the snake cannot completely reverse directions.
		if(currentDirection == Direction.UP && d == Direction.DOWN) {
			canMove = false;
			return;
		}
		if(currentDirection == Direction.DOWN && d == Direction.UP) {
			canMove = false;
			return;
		}
		if(currentDirection == Direction.RIGHT && d == Direction.LEFT) {
			canMove = false;
			return;
		}
		if(currentDirection == Direction.LEFT && d == Direction.RIGHT) {
			canMove = false;
			return;
		}
		
		
		if(canMove == true) {
			currentDirection = d;
			canMove=false;
		}
		
	}

	public void reset(Location loc) {
		//1. clear the snake
		snake.clear();
		//2. set the location of the head
		head.setLocation(loc);
		//3. add the head to the snake
		snake.add(head);
	}

	public boolean isOutOfBounds() {
		//1. complete the method so it returns true if the head of the snake is outside of the window
		//   and false otherwise
		if(head.getLocation().x>_00_SnakeGame.WIDTH || head.getLocation().x < 0) {
			return true;
		}
		if(head.getLocation().y>_00_SnakeGame.HEIGHT || head.getLocation().y < 0) {
			return true;
		}
		return false;
	}
	
	public boolean isHeadCollidingWithBody() {
		//1. complete the method so it returns true if the head is located
		//   in the same location as any other body segment
		for (int i = 1; i < snake.size(); i++) {
			if(snake.get(i).getLocation()==head.getLocation()) {
				return true;
			}
			}
		
		return false;
	}

	public boolean isLocationOnSnake(Location loc) {
		//1. complete the method so it returns true if the passed in
		//   location is located on the snake
		for (int i = 0; i < snake.size(); i++) {
			if(snake.get(i).getLocation() == loc) {
				return true;
			}
		}
		return false;
	}

	public void draw(Graphics g) {
		for (SnakeSegment s : snake) {
			s.draw(g);
		}
	}
}
