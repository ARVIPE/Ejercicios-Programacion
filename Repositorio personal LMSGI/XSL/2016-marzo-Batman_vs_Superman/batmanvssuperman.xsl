<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="html" encoding="UTF-8"/>

  <xsl:template match="/cine">
    <html>
      <head>
        <title>Batman vs Superman</title>
        <style>
          thead td {
          background: #5077cc;
          color: #FFFFFF;
          }
          img {
          width: 60%;
          }
          .titulo {
          background: #1e3356;
          color: #FFFFFF;
          }
        </style>
      </head>
      <body>
        <h1>ArteOcho Lucena</h1>
        <xsl:for-each select="titulo">
          <xsl:call-template name="pintaFila"></xsl:call-template>
        </xsl:for-each>
        <h2>Batman vs Superman: El Amanecer de la Justicia</h2>
        <h3>Estreno: 23/03/2016</h3>
      </body>
    </html>
  </xsl:template>

  <xsl:template name="pintaFila">

    <tr>
      
      <td>
        <img src="{/cine/titulo/imagen}"/>
      </td>
      <td>
        <xsl:value-of select="@desc"/>
      </td>
    </tr>

  </xsl:template>

  <xsl:template name="bucleForFila">
    <xsl:param name="i"/>
    <xsl:if test="$i &lt;= 8">
      <tr>
        <xsl:call-template name="bucleForColumna">
          <xsl:with-param name="i">
            <xsl:value-of select="$i"/>
          </xsl:with-param>
          <xsl:with-param name="j">1</xsl:with-param>
        </xsl:call-template>
      </tr>
      <xsl:call-template name="bucleForFila">
        <xsl:with-param name="i">
          <xsl:value-of select="$i + 1"/>
        </xsl:with-param>
      </xsl:call-template>
    </xsl:if>
  </xsl:template>

  <xsl:template name="bucleForColumna">
    <xsl:param name="i"/>
    <xsl:param name="j"/>
    <xsl:if test="$j &lt;= 8">
      <xsl:call-template name="celda">
        <xsl:with-param name="x">
          <xsl:value-of select="$j"/>
        </xsl:with-param>
        <xsl:with-param name="y">
          <xsl:value-of select="$i"/>
        </xsl:with-param>
      </xsl:call-template>
      <xsl:call-template name="bucleForColumna">
        <xsl:with-param name="i">
          <xsl:value-of select="$i"/>
        </xsl:with-param>
        <xsl:with-param name="j">
          <xsl:value-of select="$j + 1"/>
        </xsl:with-param>
      </xsl:call-template>
    </xsl:if>
  </xsl:template>

  <xsl:template name="celda">
    <xsl:param name="x"/>
    <xsl:param name="y"/>
    <td>
      <xsl:for-each select="posicion">
        <xsl:if test="$x = @x and $y = @y">
          <xsl:choose>
            <xsl:when test="@tipo = 'pared'">
              <xsl:attribute name="class">pared</xsl:attribute>
            </xsl:when>
            <xsl:otherwise>
              <xsl:attribute name="class">tanque</xsl:attribute>
            </xsl:otherwise>
          </xsl:choose>
        </xsl:if>
      </xsl:for-each>
    </td>
  </xsl:template>

</xsl:stylesheet>