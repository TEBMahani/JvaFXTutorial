/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation.transition.transitionDemo3;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurveTo;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

/**
 *
 * @author TEBMahani(Tayebeh Esmaeili Beigi Mahani)
 */
public class Transitions{
                              // Static Final Values

	// ***********************************************************************************************************************
                              // Static Variables

	// ***********************************************************************************************************************
                              // Final Fields

	// ***********************************************************************************************************************
                              // Fields

	// ***********************************************************************************************************************
                              // Constructors

	// ***********************************************************************************************************************
                              // Methods
   
   public static FadeTransition fade(Duration duration, Shape shape) {
      
      FadeTransition fd;
      
      fd = new FadeTransition(duration, shape);
      fd.setFromValue(1.);
      fd.setToValue(0.2);
      fd.setCycleCount(2);
      fd.setAutoReverse(true);
      
      return fd;
      
   } // End of fade(Duration duration, Shape shape)
   
   public static ParallelTransition paralle(Animation[] animations) {
      
      ParallelTransition pt;
      
      pt = new ParallelTransition();
      pt.setCycleCount(1);
      
      pt.getChildren().addAll(animations);
      
      return pt;
      
   } // End of paralle(Animation[] animations)
   
   private static Path leftPath() {
      
      Path path;
      
      path = new Path();
      path.getElements().add(new MoveTo(0, 0));
      path.getElements().add(new QuadCurveTo(200, 70, 80, 187));
      
      return path;
      
   } // End of leftPath()
   
   private static Path rightPath() {
      
      Path path;
      
      path = new Path();
      path.getElements().add(new MoveTo(200, 0));
      path.getElements().add(new QuadCurveTo(120, 50, 85, 155));
      
      return path;
      
   } // End of rightPath()
   
   public static PathTransition path(Duration duration, Shape shape, String side) {
      
      Path path;
      PathTransition pt;
      
      if(side.equalsIgnoreCase("Left")) {
         path = Transitions.leftPath();
      } // End of if(side.equalsIgnoreCase("Left"))
      else {
         path = Transitions.rightPath();
      } // End of else
          
      pt = new PathTransition();
      pt.setCycleCount(1);
      pt.setDuration(duration);
      pt.setNode(shape);
      pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
      pt.setPath(path);
     
      return pt;
      
   } // End of path(Duration duration, Shape shape, String side)
   
   public static RotateTransition rotate(Duration duration, Shape shape, double rotate) {
      
      RotateTransition rt;
      
      rt = new RotateTransition(duration, shape);
    //  rt.setFromAngle(0);
      rt.setToAngle(rotate);
      rt.setCycleCount(1);
      
      return rt;
      
   } // End of RotateTransition rotate(Duration duration, Shape shape, double rotate)
   
   public static SequentialTransition sequential(Animation[] animations) {
      
      SequentialTransition st;
      
      st = new SequentialTransition();
      st.setCycleCount(1);
      
      st.getChildren().addAll(animations);
      
      return st;
      
   } // End of sequential(Animation[] animations)
   
   public static TranslateTransition translate(Duration duration, Shape shape) {
      
      TranslateTransition tt;
      
      tt = new TranslateTransition(duration, shape);
      tt.setByX(35);
      tt.setCycleCount(1);
      
      return tt;
      
   } // End of translate(Duration duration, Shape shape)

		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                        //	*** Setter Methods ***

		// ------------------------------------------------------------------------------------------------
                        //	*** getter Methods ***

} // End of class Transitions
