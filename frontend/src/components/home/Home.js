import React from "react";
import Film from "../film/Film";

const Home = ({ movies }) => {
  return <Film movies={movies} />;
};

export default Home;
