package com.owens.oobjloader.builder;

// This code was written by myself, Sean R. Owens, sean at guild dot net,
// and is released to the public domain. Share and enjoy. Since some
// people argue that it is impossible to release software to the public
// domain, you are also free to use this code under any version of the
// GPL, LPGL, Apache, or BSD licenses, or contact me for use of another
// license.  (I generally don't care so I'll almost certainly say yes.)
// In addition this code may also be used under the "unlicense" described
// at http://unlicense.org/ .  See the file UNLICENSE in the repo.

import java.util.*;

import org.joml.Vector3d;
import org.joml.Vector3f;

import java.text.*;
import java.io.*;
import java.io.IOException;

public class Face {

    public ArrayList<FaceVertex> vertices = new ArrayList<FaceVertex>();
    public Material material = null;
    public Material map = null;

    public Face() {
    }

    public void add(FaceVertex vertex) {
        vertices.add(vertex);
    }
    public Vector3d faceNormal = new Vector3d(0, 0, 0);

    // @TODO: This code assumes the face is a triangle.  
    public void calculateTriangleNormal() {
        double[] edge1 = new double[3];
        double[] edge2 = new double[3];
        double[] normal = new double[3];
        Vector3d v1 = vertices.get(0).v;
        Vector3d v2 = vertices.get(1).v;
        Vector3d v3 = vertices.get(2).v;
        double[] p1 = {v1.x, v1.y, v1.z};
        double[] p2 = {v2.x, v2.y, v2.z};
        double[] p3 = {v3.x, v3.y, v3.z};

        edge1[0] = p2[0] - p1[0];
        edge1[1] = p2[1] - p1[1];
        edge1[2] = p2[2] - p1[2];

        edge2[0] = p3[0] - p2[0];
        edge2[1] = p3[1] - p2[1];
        edge2[2] = p3[2] - p2[2];

        normal[0] = edge1[1] * edge2[2] - edge1[2] * edge2[1];
        normal[1] = edge1[2] * edge2[0] - edge1[0] * edge2[2];
        normal[2] = edge1[0] * edge2[1] - edge1[1] * edge2[0];

        faceNormal.x = normal[0];
        faceNormal.y = normal[1];
        faceNormal.z = normal[2];
    }

	public String toString() { 
        String result = "\tvertices: "+vertices.size()+" :\n";
        for(FaceVertex f : vertices) {
            result += " \t\t( "+f.toString()+" )\n";
        }
        return result;
    }
}   