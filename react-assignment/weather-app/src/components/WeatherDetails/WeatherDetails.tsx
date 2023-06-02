import { useLocation, useNavigate } from "react-router-dom";
import { Header } from "../Header/Header";
import { containerStyle, divStyle } from "../Header/HeaderStyle";
import { WeatherDetailsVerticalStyle, addListStyle, backStyle, cityNameTextStyle, imgStyle, innerDiv, innerVerticalStyle, tempTextStyle, textStyle, weatherDetGap } from "./WeatherDetailsStyle";
import back from '../../assets/arrow_back_ios_24px.png';
import union from '../../assets/Union.png';
import { TempCard } from "../TempCard/TempCard";
import { tempCardStyle } from "../TempCard/TempCardStyle";
import { useState } from "react";

export const WeatherDetails = () => {
  const location = useLocation();
  const navigate = useNavigate();
  const { data } = location.state;

  const storedArray = localStorage.getItem("storedProp");
  const parsedArray = storedArray ? JSON.parse(storedArray) : [];
  const [newList, setNewList] = useState<string[]>(parsedArray);

  const handleClick = () => {
    console.log(newList);
    navigate('/', { state: { newList } });
  };

  const addToList = () => {
    const name = data.name;

    if (!newList.includes(name)) {
      const updatedList = [...newList, name];
      setNewList(updatedList);
      localStorage.setItem("storedProp", JSON.stringify(updatedList));
    }
  };

  if (!data) {
    return <div>Loading...</div>; // Or any other loading state
  }

  const weatherpng = data.weather ? `https://openweathermap.org/img/wn/${data.weather[0].icon}@2x.png` : '';

  return (
    <>
      <Header containerStyle={containerStyle} divStyle={divStyle} />
      <div style={WeatherDetailsVerticalStyle}>
        <div style={innerVerticalStyle}>
          <div style={innerDiv}><img src={back} /></div>
          <div style={backStyle} onClick={handleClick}>Back</div>
        </div>

        <div style={weatherDetGap}></div>
        <div>
          <div><img src={weatherpng} style={imgStyle} /></div>
          <div style={cityNameTextStyle}>{data.name}</div>
          <div style={tempTextStyle}>{data.main.temp}</div>
        </div>
        <div style={weatherDetGap}></div>

        <div style={innerVerticalStyle}>
          <div style={addListStyle}>
            <div style={textStyle} onClick={addToList}>Add to list</div>
          </div>
          <div><img src={union} /></div>
        </div>
      </div>
      <TempCard tempCardStyle={tempCardStyle} data={data} />
    </>
  );
};
