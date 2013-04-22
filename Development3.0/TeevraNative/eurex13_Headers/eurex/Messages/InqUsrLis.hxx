/* Generated by Xgen from: E80.01.05 on: 2005-01-14 09:16 */
/*******************************************************************************
* 2005 (c) Copyright Eurex (R) Zuerich AG, Eurex (R) Frankfurt AG
********************************************************************************
*
*  FILE NAME:   InqUsrLis.hxx
*
*  DESCRIPTION: Layouts used for
*               Inquire User List
*
*******************************************************************************/

#ifndef _INQUSRLIS_HXX_
#define _INQUSRLIS_HXX_

#if defined(__cplusplus) || defined(c_plusplus)
extern "C" {
#endif

#include <DRIV_common_structs.hxx>
#include <DRIV_data_types.hxx>

#define BSC_INQ_USR_LIS_REC_MAX	300

/******************************************************************************/

#ifndef _BSC_INQ_USR_LIS_REQUEST_T_
#define _BSC_INQ_USR_LIS_REQUEST_T_

typedef struct bscInqUsrLisRequestTag
{
  char keyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN];
} bscInqUsrLisRequestT, *pBscInqUsrLisRequestT;


#endif  /* _BSC_INQ_USR_LIS_REQUEST_T_ */

/******************************************************************************/

#ifndef _INQ_USR_LIS_REQUEST_T_
#define _INQ_USR_LIS_REQUEST_T_

typedef struct inqUsrLisRequestTag
{
  dataHeaderT header;
  bscInqUsrLisRequestT basic;
} inqUsrLisRequestT, *pInqUsrLisRequestT;


#endif  /* _INQ_USR_LIS_REQUEST_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_USR_LIS_REC_T_
#define _BSC_INQ_USR_LIS_REC_T_

typedef struct bscInqUsrLisRecTag
{
  trdrIdGrpT trdrIdGrp;
} bscInqUsrLisRecT, *pBscInqUsrLisRecT;


#endif  /* _BSC_INQ_USR_LIS_REC_T_ */

/******************************************************************************/

#ifndef _BSC_INQ_USR_LIS_RESPONSE_T_
#define _BSC_INQ_USR_LIS_RESPONSE_T_

typedef struct bscInqUsrLisResponseTag
{
  char keyDataCtrlBlk[KEY_DATA_CTRL_BLK_LEN];
  char mliRecCtr[DRIV_MLI_REC_CTR_LEN];
  bscInqUsrLisRecT bscInqUsrLisRec[BSC_INQ_USR_LIS_REC_MAX];
} bscInqUsrLisResponseT, *pBscInqUsrLisResponseT;


#endif  /* _BSC_INQ_USR_LIS_RESPONSE_T_ */

/******************************************************************************/

#ifndef _INQ_USR_LIS_RESPONSE_T_
#define _INQ_USR_LIS_RESPONSE_T_

typedef struct inqUsrLisResponseTag
{
  dataHeaderT header;
  bscInqUsrLisResponseT basic;
} inqUsrLisResponseT, *pInqUsrLisResponseT;


#endif  /* _INQ_USR_LIS_RESPONSE_T_ */

/******************************************************************************/

#if defined(__cplusplus) || defined(c_plusplus)
} /* close scope of 'extern "C"' declaration which encloses file. */
#endif

#endif /* _INQUSRLIS_HXX_ */

/******************************************************************************/
/* End of file InqUsrLis.hxx */
/******************************************************************************/
