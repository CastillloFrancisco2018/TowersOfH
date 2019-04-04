using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Sphere : MonoBehaviour 
{
    int num = 0;
	// Use this for initialization
	void Start () {
		
	}
	
	// Update is called once per frame
	void Update () {
        print("Hello" + num++);	
	}

    //called 60x per second
	private void FixedUpdate()
	{
		
	}
}
