using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class RoomCollection
{
    private GameObject roomPrefab;
    private Transform parentTransform;
    public string name;
    public double xOrigin = 0;
    public double yOrigin = 0;
    public double zOrigin = 0;
    public List<Room> theRooms = new List<Room>();

    public RoomCollection(Transform parentTransform, GameObject roomPrefab, string name, double xOrigin, double yOrigin, double zOrigin)
    {
        this.roomPrefab = roomPrefab;
        this.parentTransform = parentTransform;
        this.name = name;
        this.xOrigin = xOrigin;
        this.yOrigin = yOrigin;
        this.zOrigin = zOrigin;
    }
    public void jsonSetup(GameObject roomPrefab, Transform parentTransform)
    {
        this.roomPrefab = roomPrefab;
        this.parentTransform = parentTransform;
        foreach (Room r in this.theRooms)
        {
            r.generateRoom(roomPrefab, parentTransform);
        }
        this.parentTransform.Rotate(90, 0f, 0f, Space.Self);
    }

    public void addRoom(string name, int length, int width, int height, double x, double y, double z)
    {
        this.theRooms.Add(new Room(this.parentTransform, this.roomPrefab, name, length, width, height, x, y, z));
    }

    public string toJSON()
    {
        return JsonUtility.ToJson(this);
    }
}

[System.Serializable]
public class Room
{
    private GameObject roomPrefab;
    private Transform parentTransform;
    public string name;
    public int length, width, height;
    public double x, y, z;

    public Room(Transform parentTransform, GameObject roomPrefab, string name, int length, int width, int height, double x, double y, double z)
    {
        this.roomPrefab = roomPrefab;
        this.parentTransform = parentTransform;
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.z = z;

        GameObject room = MonoBehaviour.Instantiate(this.roomPrefab);
        room.transform.parent = this.parentTransform;
        room.transform.position = new Vector3((float)this.x, (float)this.y, (float)this.z);
        room.transform.localScale = new Vector3(this.length, this.width, this.height);

    }

    public string toJSON()
    {
        return JsonUtility.ToJson(this);
    }
}