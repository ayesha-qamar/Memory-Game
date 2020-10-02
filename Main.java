package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {

	ImageView lastClicked = null;
	Image oneImage = new Image("butterfly.jpg");
	Image twoImage = new Image("cat.jpg");
	Image threeImage = new Image("cn.jpg");
	Image fourImage = new Image("dog.jpg");
	Image fiveImage = new Image("eiffel.jpg");
	Image sixImage = new Image("flower.jpg");
	Image sevenImage = new Image("niagara.jpg");
	Image eightImage = new Image("sunflower.jpg"); 
	Image pImage = new Image("placeholder.png");
	boolean match = true;
	boolean status = false; 
	int pairs=0;


	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane root = new GridPane();
			Scene scene = new Scene(root,1000,980);
			primaryStage.setTitle("Ayesha Qamar Memory Game");
			primaryStage.setScene(scene);
			primaryStage.show();
			ImageView iView1 = new ImageView(pImage);
			iView1.setFitHeight(250);
			iView1.setFitWidth(250);
			iView1.setPreserveRatio(true);
			ImageView iView2 = new ImageView(pImage);
			iView2.setFitHeight(250);
			iView2.setFitWidth(250);
			iView2.setPreserveRatio(true);
			ImageView iView3 = new ImageView(pImage);
			iView3.setFitHeight(250);
			iView3.setFitWidth(250);
			iView3.setPreserveRatio(true);
			ImageView iView4 = new ImageView(pImage);
			iView4.setFitHeight(250);
			iView4.setFitWidth(250);
			iView4.setPreserveRatio(true);
			ImageView iView5 = new ImageView(pImage);
			iView5.setFitHeight(250);
			iView5.setFitWidth(250);
			iView5.setPreserveRatio(true);
			ImageView iView6 = new ImageView(pImage);
			iView6.setFitHeight(250);
			iView6.setFitWidth(250);
			iView6.setPreserveRatio(true);
			ImageView iView7 = new ImageView(pImage);
			iView7.setFitHeight(250);
			iView7.setFitWidth(250);
			iView7.setPreserveRatio(true);
			ImageView iView8 = new ImageView(pImage);
			iView8.setFitHeight(250);
			iView8.setFitWidth(250);
			iView8.setPreserveRatio(true);
			ImageView iView9 = new ImageView(pImage);
			iView9.setFitHeight(250);
			iView9.setFitWidth(250);
			iView9.setPreserveRatio(true);
			ImageView iView10 = new ImageView(pImage);
			iView10.setFitHeight(250);
			iView10.setFitWidth(250);
			iView10.setPreserveRatio(true);
			ImageView iView11 = new ImageView(pImage);
			iView11.setFitHeight(250);
			iView11.setFitWidth(250);
			iView11.setPreserveRatio(true);
			ImageView iView12 = new ImageView(pImage);
			iView12.setFitHeight(250);
			iView12.setFitWidth(250);
			iView12.setPreserveRatio(true);
			ImageView iView13 = new ImageView(pImage);
			iView13.setFitHeight(250);
			iView13.setFitWidth(250);
			iView13.setPreserveRatio(true);
			ImageView iView14 = new ImageView(pImage);
			iView14.setFitHeight(250);
			iView14.setFitWidth(250);
			iView14.setPreserveRatio(true);
			ImageView iView15 = new ImageView(pImage);
			iView15.setFitHeight(250);
			iView15.setFitWidth(250);
			iView15.setPreserveRatio(true);
			ImageView iView16 = new ImageView(pImage);
			iView16.setFitHeight(250);
			iView16.setFitWidth(250);
			iView16.setPreserveRatio(true);

			root.add(iView1, 0, 0);
			root.add(iView2, 0, 1);
			root.add(iView3, 1, 0);
			root.add(iView4, 1, 1);
			root.add(iView5, 0, 2);
			root.add(iView6, 0, 3);
			root.add(iView7, 1, 2);
			root.add(iView8, 1, 3);
			root.add(iView9, 2, 0);
			root.add(iView10, 2, 1);
			root.add(iView11, 3, 0);
			root.add(iView12, 3, 1);
			root.add(iView13, 2, 2);
			root.add(iView14, 2, 3);
			root.add(iView15, 3, 2);
			root.add(iView16, 3, 3);

			iView1.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					iView1.setImage(sixImage);					
					if(lastClicked==iView12)
					{
						match = true;
						pairs++;
					}
					else {

						hideLastImage();
						match=false;
					}


					lastClicked = iView1;
					gameOver();

				}

			});
			iView2.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					iView2.setImage(twoImage);
					if(lastClicked==iView3)
					{
						match=true;
						pairs++;

					}
					else {

						hideLastImage();
						match=false;
					}
					lastClicked = iView2;
					gameOver();
				}
			});
			iView3.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					iView3.setImage(twoImage);
					if(lastClicked==iView2)
					{
						match=true;
						pairs++;
					}
					else {

						hideLastImage();
						match=false;
					}
					lastClicked = iView3;
					gameOver();

				}
			});
			iView4.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					iView4.setImage(oneImage);
					if(lastClicked==iView9)
					{
						match=true;
						pairs++;
					}
					else {
						hideLastImage();
						match=false;
					}
					lastClicked = iView4;
					gameOver();
				}
			});
			iView5.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					iView5.setImage(threeImage);
					if(lastClicked==iView8)
					{
						match=true;
						pairs++;
					}
					else {
						hideLastImage();
						match=false;
					}
					lastClicked = iView5;
					gameOver();
				}
			});
			iView6.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					iView6.setImage(fourImage);
					if(lastClicked==iView15)
					{
						match=true;
						pairs++;
					}
					else {
						hideLastImage();
						match=false;
					}
					lastClicked = iView6;
					gameOver();
				}
			});
			iView7.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					iView7.setImage(eightImage);
					if(lastClicked==iView16)
					{
						match=true;
						pairs++;
					}
					else {
						hideLastImage();
						match=false;
					}
					lastClicked = iView7;
					gameOver();
				}
			});
			iView8.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					iView8.setImage(threeImage);
					if(lastClicked==iView5)
					{
						match=true;
						pairs++;
					}
					else {
						hideLastImage();
						match=false;
					}
					lastClicked = iView8;
					gameOver();
				}
			});
			iView9.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					iView9.setImage(oneImage);
					if(lastClicked==iView4)
					{
						match=true;
						pairs++;
					}
					else {
						hideLastImage();
						match=false;
					}
					lastClicked = iView9;
					gameOver();
				}
			});
			iView10.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					iView10.setImage(fiveImage);
					if(lastClicked==iView11)
					{
						match=true;
						pairs++;
					}
					else {
						hideLastImage();
						match=false;
					}
					lastClicked = iView10;
					gameOver();
				}
			});
			iView11.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					iView11.setImage(fiveImage);
					if(lastClicked==iView10)
					{
						match=true;
						pairs++;
					}
					else {
						hideLastImage();
						match=false;
					}
					lastClicked = iView11;
					gameOver();
				}
			});
			iView12.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					iView12.setImage(sixImage);
					if(lastClicked==iView1)
					{
						match=true;	
						pairs++;

					}
					else {
						hideLastImage();
						match=false;
					}
					lastClicked = iView12;
					gameOver();
				}
			});
			iView13.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					iView13.setImage(sevenImage);
					if(lastClicked==iView14)
					{
						match=true;
						pairs++;
					}
					else {
						hideLastImage();
						match=false;
					}
					lastClicked = iView13;
					gameOver();
				}
			});
			iView14.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					iView14.setImage(sevenImage);
					if(lastClicked==iView13)
					{
						match=true;
						pairs++;
					}
					else {
						hideLastImage();
						match=false;
					}
					lastClicked = iView14;
					gameOver();
				}
			});
			iView15.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					iView15.setImage(fourImage);
					if(lastClicked==iView6)
					{
						match=true;
						pairs++;
					}
					else {
						hideLastImage();
						match=false;
					}
					lastClicked = iView15;
					gameOver();
				}
			});
			iView16.setOnMouseClicked(new EventHandler<MouseEvent>() {
				@Override
				public void handle(MouseEvent event) {
					iView16.setImage(eightImage);
					if(lastClicked==iView7)
					{
						match = true;
						pairs++;
					}
					else {
						hideLastImage();
						match=false;
					}
					lastClicked = iView16;
					gameOver();
				}
			});


			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void hideLastImage() {
		if (match != true) {
			lastClicked.setImage(pImage);
		}
	}
	public boolean isOver() {
		if(pairs==8) {
			return true;
		}
		return false;
	}
	public void gameOver() {
		if(isOver()) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Game Over");
			alert.setHeaderText(null);
			alert.setContentText("You won! Game Over.");

			alert.showAndWait();
			System.out.println("Congratulations! You finished the game");
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}